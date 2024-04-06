/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprojetosocket.servidor;

/**
 *
 * @author Jorge
 */
import java.net.*;
import java.io.*;
public class Principal	 {
  public static void main(String[] args) {
    try {
      ServerSocket servidor = new ServerSocket(5555);
      System.out.println("Aguardando cliente!");
      Socket socket = servidor.accept(); // espera
      System.out.println("Chegou o cliente :" 
           + socket.getInetAddress().getHostAddress());       
      BufferedReader in = new BufferedReader(
           new InputStreamReader(socket.getInputStream()));	   
      String mensagem = "";
      while ((mensagem = in.readLine()) != null) {
         System.out.println(mensagem);
      }
    } catch (IOException e) {
      System.err.println("Problemas de IO");
    }
  }
}
