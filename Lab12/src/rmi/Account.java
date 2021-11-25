/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author duchi
 */
public interface Account extends Remote {
    public String getName() throws RemoteException;
 public float getBalance() throws RemoteException;
 public void withdraw(float amt) throws RemoteException;
 public void deposit(float amt) throws RemoteException;
 public void transfer(float amt, Account src) throws RemoteException;
}
