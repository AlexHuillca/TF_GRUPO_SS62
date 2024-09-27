package com.example.lookup.repository;

public class DetallePedidoNotFoundException extends RuntimeException{
    public DetallePedidoNotFoundException(Integer id) {
        super("DetallePedido not found with id: " + id);
    }
}
