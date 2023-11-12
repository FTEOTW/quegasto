package com.ps.quegasto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.quegasto.model.Presupuesto;
import com.ps.quegasto.model.UsuarioPresupuesto;
import com.ps.quegasto.repository.IUsuarioPresupuesto;

@Service
public class UsuarioPresupuestoService {

	@Autowired
	private IUsuarioPresupuesto repository;

	public List<Presupuesto> obtenerPresupuestosPorUsuario(int idUsuario) {
		
		List<Presupuesto> lst = new ArrayList<>();
		
		List<UsuarioPresupuesto> cat = repository.findByUsuarioId(idUsuario);
		
		for (UsuarioPresupuesto value : cat)
		{
			lst.add(value.getPresupuesto());
		}
		
		return lst;
		
	}

	public void asignarPresupuestoAUsuario(int idPresupuesto, int idUsuario) {

	}

	public void quitarPresupuestoAUsuario(int idPresupuesto, int idUsuario) {

	}
}