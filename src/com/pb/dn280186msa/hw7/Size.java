package com.pb.dn280186msa.hw7;

public enum Size {

    XXS("XXS","Детский размер", 32),
    XS("XS","Взрослый размер", 34),
    S("S","Взрослый размер", 36),
    M ("M","Взрослый размер", 38),
    L ("L","Взрослый размер", 40);

    String Size;
    String Description;
    int EuroSize;

    public String getDescription() {
        return Description;
    }

    public int getEuroSize() {
        return EuroSize;
    }

    Size(String size, String description, int euroSize) {
        Size = size;
        Description = description;
        EuroSize = euroSize;
    }

    @Override
    public String toString() {
        return  Size + " (" + Description + "), " + "Европейский - " + EuroSize;
    }
}

