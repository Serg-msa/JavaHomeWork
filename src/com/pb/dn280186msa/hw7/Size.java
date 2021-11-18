package com.pb.dn280186msa.hw7;

public enum Size {

    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M ("Взрослый размер", 38),
    L ("Взрослый размер", 40);

    String Description;
    int EuroSize;

    Size(String description, int euroSize) {
        Description = description;
        EuroSize = euroSize;
    }

    void getDescription(String size) {
      this.Description = size;
    }

    public int getEuroSize() {
        return EuroSize;
    }

}
