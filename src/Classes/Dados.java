/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author marcelo_eger
 */
public class Dados {
   private int idade;
    private int altura;
    private int peso;
    private int tmbs;
    private double pro1;
private double car1;
private double gor1;
  private double pro2;
private double car2;
private double gor2;
  private double pro3;
private double car3;
private double gor3;
private double tdee1;

  private double imcGeral;
    private double imc;
    private double pesoide;

    public double getPesoide() {
        return pesoide;
    }

    public void setPesoide(double pesoide) {
        this.pesoide = 0.67 * altura - 56;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = peso/((altura/100)^2);
    }

    public double getImcGeral() {
        return imcGeral;
    }

    public void setImcGeral(double imcGeral) {
        this.imcGeral = imcGeral;
    }
      


    public double getTdee1() {
        return tdee1;
    }

    public void setTdee1(double tdee1) {
        this.tdee1 = tmbs * imcGeral;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public int getTmbs() {
        return tmbs;
    }

    public void setTmbs(int tmbs) {
        this.tmbs = (int) ((altura * 6.25) + (peso * 9.99) - (idade * 4.92) -5); 
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPro1() {
        return pro1;
    }

    public void setPro1(double pro1) {
        this.pro1 = tdee1 * 0.28/4;
    }

    public double getCar1() {
        return car1;
    }

    public void setCar1(double car1) {
        this.car1 = tdee1*0.49/4;
    }

    public double getGor1() {
        return gor1;
    }

    public void setGor1(double gor1) {
        this.gor1 = tdee1*0.27/9;
    }

    public double getPro2() {
        return pro2;
    }

    public void setPro2(double pro2) {
        this.pro2 = tdee1*0.33/4;
    }

    public double getCar2() {
        return car2;
    }

    public void setCar2(double car2) {
        this.car2 = tdee1*0.3/4;
    }

    public double getGor2() {
        return gor2;
    }

    public void setGor2(double gor2) {
        this.gor2 = tdee1*0.33/9;
    }

    public double getPro3() {
        return pro3;
    }

   public void setPro3(int pro3) {
   
        this.pro3 = tdee1 * 0.28/4;
    }

    public double getCar3() {
        return car3;
    }

    public void setCar3(double car3) {
        this.car3 = tdee1*0.52/4;
    }

    public double getGor3() {
        return gor3;
    }

    public void setGor3(double gor3) {
        this.gor3 = tdee1*0.20/9;
    }

 

            
            
        
    
}
