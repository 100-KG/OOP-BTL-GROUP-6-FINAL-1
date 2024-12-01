/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_and_db;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author TRAN XUAN THANH
 */
public class Ticket {
    private String ticketID;
    private String readerCCCD;
    private String bookID;
    private LocalDate borrow_date;
    private LocalDate return_date;
    private String status;
    
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    
    public static void autoaddTickets() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src/code_and_db/Ticket.txt"));
        String ticketID;
        while ((ticketID = br.readLine()) != null){
            Ticket ticket = new Ticket(ticketID, br.readLine(), br.readLine(), LocalDate.parse(br.readLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    LocalDate.parse(br.readLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")), br.readLine());
            tickets.add(ticket);
        }    
    }
    
    public Ticket(String ticketID, String readerCCCD, String bookID, LocalDate borrow_date, LocalDate return_date, String status) {
        this.ticketID = ticketID;
        this.readerCCCD = readerCCCD;
        this.bookID = bookID;
        this.borrow_date = borrow_date;
        this.return_date = return_date;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public String getTicketID() {
        return ticketID;
    }

    public String getReaderCCCD() {
        return readerCCCD;
    }

    public String getBookID() {
        return bookID;
    }

    public LocalDate getBorrow_date() {
        return borrow_date;
    }

    public LocalDate getReturn_date() {
        return return_date;
    }
    public String getBorrow_dateAsString(){
        return getBorrow_date().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public String getReturn_dateAsString(){
        return getReturn_date().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public static ArrayList<Ticket> getTicketList(){
        return tickets;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public void setReaderCCCD(String readerCCCD) {
        this.readerCCCD = readerCCCD;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setBorrow_date(LocalDate borrow_date) {
        this.borrow_date = borrow_date;
    }

    public void setReturn_date(LocalDate return_date) {
        this.return_date = return_date;
    }
    
    
}
