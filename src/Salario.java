/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
class Salario {
    
    private float salario;
    private float aliquota;
    private float parcelaADeduzir;
    
    public Salario(float salario){
        this.salario = salario;
        this.aliquota = aliquota;
        this.parcelaADeduzir = parcelaADeduzir;
    }
    
    public float simulador1(){
        float resultINSS = 0;
        if (salario < 1693.72){
            aliquota = (float) 0.08;
            resultINSS = salario * aliquota;
        }
        if (salario >= 1693.73 && salario <= 2822.91){
            aliquota = (float) 0.09;
            resultINSS = salario * aliquota;
        }
        if(salario >= 2822.91 && salario <= 5645.80){
            aliquota = (float) 0.011;
            resultINSS = salario * aliquota;
        }
        return resultINSS;
    }
    
    public float simulador2(){
        float resultIRRF = 0;
        if(salario >= 1903.99 && salario <= 2826.66){
            aliquota = (float) 0.075;
            parcelaADeduzir = (float) 142.80;
            resultIRRF= salario * aliquota;
          
        }
        if(salario >= 2826.66 && salario <=3751.05){
            aliquota = (float) 0.15;
            parcelaADeduzir = (float) 354.80;
            resultIRRF= salario * aliquota;
            
        }
        if(salario>= 3751.06 && salario <= 4644.68){
            aliquota = (float) 0.225;
            parcelaADeduzir = (float) 636.13;
            resultIRRF= salario * aliquota;
            
        }
        if(salario > 4664.68){
            aliquota = (float) 0.275;
            parcelaADeduzir = (float) 869.36;
            resultIRRF= salario * aliquota;
            
        }
        return resultIRRF;
        
    }
}
