package com.fra.test.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fra.test.dao.ClienteDao;
import com.fra.test.models.Cliente;

@Repository
public class ClienteDaoImpl implements ClienteDao {

	@Override
	public void add(Cliente c) {
		System.out.println("Adding cliente");
	}

	@Override
	public void update(Cliente c) throws SQLException {
		System.out.println("Updating cliente");
	}

	@Override
	public void deleteById(long id) throws SQLException {
		System.out.println("Deleting by id");
	}

	@Override
	public Cliente getById(long id) throws SQLException {
		return Cliente.create()
				.setId(id)
				.setNombreApellido("Renzo")
				.setDireccion("Direccion");
	}

	@Override
	public List<Cliente> get() {
		return new ArrayList<Cliente>();
	}

}
