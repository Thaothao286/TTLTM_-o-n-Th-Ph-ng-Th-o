/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author duchi
 */
public class AccountImpl extends UnicastRemoteObject implements Account {
 private float balance = 0;
 private String name = "";
 // Constructor creates a new account with the given name
 public AccountImpl() throws RemoteException
 {

 }
 public AccountImpl(String aName) throws RemoteException {
 name = aName;
 }
 public String getName() throws RemoteException {
 return name;
 }
 public float getBalance() throws RemoteException {
 return balance;
 }
 //Withdraw some funds
 public void withdraw(float amt) throws RemoteException {
 balance -= amt;
 //Ensure balance never drops below zero
 balance = Math.max(balance, 0);
 }
 //Deposit some funds
 public void deposit(float amt) throws RemoteException {
 balance += amt;
 }
 //Transfer some funds from another (remote) account Into this one
public void transfer(float amt, Account src) throws RemoteException
{
 src.withdraw(amt);
 this.deposit(amt);
}
}
