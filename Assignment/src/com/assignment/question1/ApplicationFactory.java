package com.assignment.question1;

import java.util.Scanner;

import com.assignment.question1.ApplicationFactory;

public class ApplicationFactory {
	public String fetchApplication(int a){
		String[] app= {"WhatsApp","FaceBook","Telegram","Instagram","Twitter"};
		return app[a];
}
	public void applicationDetails(String ans) {
		String[][]app1= {
				{"WhatsApp","WhatsApp Messenger, or simply WhatsApp, is an American freeware, cross-platform centralized messaging and voice-over-IP service owned by Facebook, Inc."},
				{"FaceBook","Facebook, Inc., is an American technology conglomerate based in Menlo Park, California. It was founded by Mark Zuckerberg"},
				{"Telegram","Telegram is a freeware, cross-platform, cloud-based instant messaging software and application service."},
				{"Instagram","Instagram is an American photo and video sharing social networking service owned by Facebook, created by Kevin Systrom and Mike Krieger and originally launched on iOS in October 2010"},
				{"Twitter","Twitter is an American microblogging and social networking service on which users post and interact with messages known as \"tweets\"."}
		};
		
		for(int i=0;i<4;i++) {
			if(app1[i][0]==ans)
			System.out.println(app1[i][1]);
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int loop=1;
		do {
		System.out.println("Select an option:\n1.WhatsApp\n2.FaceBook\n3.Telegram\n4.Instagram\n5.Twitter");
		System.out.println("Choose any option to see description about Application OR To exit press 0");
		int opt = sc.nextInt();
		ApplicationFactory af=new ApplicationFactory();
		String ans=af.fetchApplication(opt);
		af.applicationDetails(ans);
		loop = sc.nextInt();
	}while(loop!=0);
		System.out.println("END");
	}
}
