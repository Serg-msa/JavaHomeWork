package com.pb.dn280186msa.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

        String FIO;
        LocalDate fBirth;
        String phone;
        String local;
        LocalDateTime dateMod;

        public String getFIO() {
                return FIO;
        }

        public void setFIO(String FIO) {
                this.FIO = FIO;
        }

        public LocalDate getDateOfBirth() {
                return fBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
                this.fBirth = dateOfBirth;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getLocal() {
                return local;
        }

        public void setLocal(String local) {
                this.local = local;
        }

        public LocalDateTime getDateMod() {
                return dateMod;
        }

        public void setDateMod(LocalDateTime dateMod) {
                this.dateMod = dateMod;
        }

        public Person(String FIO, LocalDate fBirth, String phone, String local) {
                this.FIO = FIO;
                this.fBirth = fBirth;
                this.phone = phone;
                this.local = local;
                this.dateMod = LocalDateTime.now();
        }


}




