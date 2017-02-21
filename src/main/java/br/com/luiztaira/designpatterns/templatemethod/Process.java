package br.com.luiztaira.designpatterns.templatemethod;

public abstract class Process {

    public abstract void initialize();

    public abstract void fillForm();

    public abstract void finalize();

    public  void startProcess(){
        this.initialize();
        this.fillForm();
        this.finalize();
    }
}
