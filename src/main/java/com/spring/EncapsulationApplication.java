package com.spring;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.model.BillSummary;

@SpringBootApplication
public class EncapsulationApplication {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the inputs here");
		System.out.println("Enter the SubTotal Amount");
		Double subTotal = ss.nextDouble();
		System.out.println("Enter the Promo Amount");
		Double promoAmt = ss.nextDouble();
		System.out.println("Enter the Vat Amount");
		Double vatAmt = ss.nextDouble();
		System.out.println("Enter the DelCharge Amount");
		Double delChargeAmt = ss.nextDouble();
		System.out.println("Enter the PkgCharge Amount");
		Double pkgChargeAmt = ss.nextDouble();
		//SpringApplication.run(EncapsulationApplication.class, args);
		BillSummary bb=new BillSummary();
		bb.setDelChargeAmt(delChargeAmt);
		bb.setPkgChargeAmt(pkgChargeAmt);
		bb.setPromoAmt(promoAmt);
		bb.setSubTotal(subTotal);
		bb.setVatAmt(vatAmt);
		
		System.out.println("Grand Total :"+bb.getGrandTotall());
		
	}

	}

