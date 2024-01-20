package com.ayi.EjercicioEvaluativo1.service.implementations;

import com.ayi.EjercicioEvaluativo1.entity.Usuario;
import com.ayi.EjercicioEvaluativo1.exception.UsuarioNoEncontradoException;
import com.ayi.EjercicioEvaluativo1.repository.IUsuarioRepository;
import com.ayi.EjercicioEvaluativo1.service.contracts.IUsuarioService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    @Override
    @Transactional
    public Usuario update(Integer id, Usuario usuario){

        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No se encuentra el usuario con el id" + id)));
        Usuario user = usuarioOptional.get();
        user.setNombre(usuario.getNombre());
        user.setPassword(usuario.getPassword());
        return usuarioRepository.save(user);

    }

    @Override
    @Transactional
    public Usuario findById(Usuario usuario) {
        return usuarioRepository.findById(usuario.getId()).orElse(null);
    }

    //public List<Usuario> findAll= usuarioRepository.findAll();

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

   public boolean verificarUsuario (Usuario usuario, String nombre,String password){
    Usuario user = usuarioRepository.findByNombreAndPassword(nombre, password);
    if (!usuario.getNombre().equals(user)&&!usuario.getPassword().equals(user)){
      throw new UsuarioNoEncontradoException();
    } else return true;
    }
}
