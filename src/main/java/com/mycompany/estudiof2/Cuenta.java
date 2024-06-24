
package com.mycompany.estudiof2;

class Cuenta implements Interface1{
    String name;
    double mount;
    String type;

    public Cuenta(String name, double mount, String type) {
        this.name = name;
        this.mount = mount;
        this.type = type;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMount() {
        return mount;
    }

    public void setMount(double moutn) {
        this.mount = moutn;
    }

    @Override
    public double deposit() {
        
        System.out.println("ingrese el monto a depositar :");
        double mout=scan.nextDouble();
        mount=mount+(mount*0.1);
        mount=mount+mout+(mout*0.1);
        return mount;
    }
    @Override
    public double retit() {
        System.out.println("ingrese el monto a retirar :");
        double reti=scan.nextDouble();
        mount=mount-reti;
        return mount;
        
    }

    @Override
    public double saber() {
        mount=mount+(mount*0.1);
        return mount;
        
    }
    
}
