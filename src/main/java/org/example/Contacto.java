package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Contacto contiene el nombre del contacto y un
 * listado de teléfonos asociados a dicho contacto.
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor de la clase Contacto.
     * Inicializa el nombre del contacto y agrega el primer número de teléfono a la lista.
     *
     * @param name  El nombre del contacto.
     * @param phone El número de teléfono del contacto.
     */

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return El nombre del contacto.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de números de teléfono del contacto.
     *
     * @return La lista de números de teléfono.
     */

    public List<String> getPhones() {
        return this.phones;
    }
}



