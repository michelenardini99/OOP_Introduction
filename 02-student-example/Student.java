class Student {

    // ... Aggiungere qui la definizione dei campi
    String name,surname;
    int id, matriculationYear;
    

    void build(String name,String surname,int id,int matriculationYear) {
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.matriculationYear=matriculationYear;
    }

    void printStudentInfo() {
        System.out.println(this.name + " " + this.surname + " " + this.id + " " + this.matriculationYear + " ");
    }
}
