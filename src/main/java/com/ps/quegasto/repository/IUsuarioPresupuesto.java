package com.ps.quegasto.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.quegasto.model.UsuarioPresupuesto;


@Repository
public interface IUsuarioPresupuesto extends CrudRepository<UsuarioPresupuesto, Integer> {

    List<UsuarioPresupuesto> findByUsuarioId(int idUsuario);

    List<UsuarioPresupuesto> findByPresupuestoId(int idPresupuesto);
}