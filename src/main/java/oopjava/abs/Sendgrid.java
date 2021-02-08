package oopjava.abs;

public class Sendgrid implements Mailer {

  @Override
  public void sendMail(String to, String subject, String body) {
    // call the sendgrid api and pass these values to the api to send the email
  }
  
}
