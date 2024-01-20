package com.ayi.EjercicioEvaluativo1.service.implementations;

import com.ayi.EjercicioEvaluativo1.entity.Usuario;
import com.ayi.EjercicioEvaluativo1.exception.UsuarioNoEncontradoException;
import com.ayi.EjercicioEvaluativo1.repository.IUsuarioRepository;
import com.ayi.EjercicioEvaluativo1.service.contracts.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        user.setPasswordUsuario(usuario.getPasswordUsuario());
        return usuarioRepository.save(user);

    }

    @Override
    @Transactional
    public Usuario findById(Usuario usuario) {
        return usuarioRepository.findById(usuario.getIdUsuario()).orElse(null);
    }

    //public List<Usuario> findAll= usuarioRepository.findAll();

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

   public Usuario verificarUsuario (String nombre,String password){
    Usuario user = usuarioRepository.findByNombreAndPasswordUsuario(nombre, password);
    if (user == null){
//    if (!user.getNombre().equals(nombre)||!user.getPasswordUsuario().equals(password)){
      throw new UsuarioNoEncontradoException();
    } else
        return user;
    }
}
