package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;

    // Constructor con todos los parámetros
    public FreshMerchandise(String name, String uniqueId, String responsibleId,
                            int zone, String area, String shelf, int quantity,
                            Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    // Getter para la fecha de caducidad
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    // Método para formatear la fecha a dd-MM-yyyy
    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    // Implementación del método abstracto
    @Override
    public Object getSpecificData() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ubicación: ").append(getLocation());
        sb.append(" | Fecha de caducidad: ").append(getFormattedDate(this.expirationDate));
        return sb.toString();
    }

    // Método adicional que imprime los datos específicos
    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
