package com.example.springtienda;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springtienda.entities.Producto;
import com.example.springtienda.entities.Usuario;
import com.example.springtienda.repositories.ProductoRepository;
import com.example.springtienda.repositories.UsuarioRepository;

@SpringBootApplication
public class SpringtiendaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringtiendaApplication.class, args);

       
        UsuarioRepository usuarioRepository = context.getBean(UsuarioRepository.class);
		ProductoRepository productoRepository=context.getBean(ProductoRepository.class);
		
		

		
	}

}


/*

creacion usuario y producto
UsuarioRepository usuarioRepository = context.getBean(UsuarioRepository.class);
		Usuario usuario=new Usuario();
		usuario.setNombre("jan");
		usuario.setEmail("jan@gmail.com");
		usuario.setTelefono("32456");

		usuarioRepository.save(usuario);

		ProductoRepository productoRepository=context.getBean(ProductoRepository.class,args);
		Producto producto=new Producto();
		producto.setNombre("arroz");
		producto.setPrecio(20000.0);

		productoRepository.save(producto);




		consulta
		Optional<Usuario> usuario1=usuarioRepository.findById(Long.valueOf(2));
		System.out.println(usuario1.get().getNombre());


		agregar relacion
		Optional<Usuario> usuario1=usuarioRepository.findById(Long.valueOf(1));
		Optional<Producto>producto=productoRepository.findById(Long.valueOf(1));
		Usuario usuario=usuario1.get();
		List<Producto>productos=usuario.getProductos();
		productos.add(producto.get());
		usuario.setProductos(productos);
		producto.get().setUsuario(usuario);
		Producto producto1=producto.get();
		productoRepository.save(producto1);
		usuarioRepository.save(usuario);
 */
