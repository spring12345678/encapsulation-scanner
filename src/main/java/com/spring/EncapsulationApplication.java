package com.spring;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EncapsulationApplication {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the inputs here");
		System.out.println("Enter the SubTotal Amount");
		Double subTotal=ss.nextDouble();
		System.out.println("Enter the Promo Amount");
		Double promoAmt=ss.nextDouble();
		System.out.println("Enter the Vat Amount");
		Double vatAmt=ss.nextDouble();
		System.out.println("Enter the DelCharge Amount");
		Double delChargeAmt=ss.nextDouble();
		System.out.println("Enter the PkgCharge Amount");
		Double pkgChargeAmt=ss.nextDouble();
		EncapsulationApplication aa=new EncapsulationApplication();
		aa.grandTotall(pkgChargeAmt, pkgChargeAmt, pkgChargeAmt, pkgChargeAmt, pkgChargeAmt);
		SpringApplication.run(EncapsulationApplication.class, args);
	}
	public void grandTotall(Double subTotal,Double promoAmt,Double vatAmt,Double delChargeAmt,Double pkgChargeAmt)
	{
		Double grandTotal=subTotal - (promoAmt) + (vatAmt + delChargeAmt + pkgChargeAmt);
		System.out.println(grandTotal);
	}
}
