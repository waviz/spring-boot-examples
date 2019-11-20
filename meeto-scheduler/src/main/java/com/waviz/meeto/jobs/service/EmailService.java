package com.waviz.meeto.jobs.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import com.sendgrid.SendGrid;
import java.io.IOException;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.Method;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class EmailService{
   Logger logger = LoggerFactory.getLogger(EmailService.class);
    
    @Value("${sendgrid.api.key}") 
    private String appKey;
    @Value("${templateId}")
    private String EMAIL_TEMPLATE_ID;

public Mail prepareMail()
  {
  logger.info("callingPrepareMail");
   Mail mail = new Mail();
   Email fromEmail = new Email();
   fromEmail.setEmail("aman.chand@waviz.com");
   fromEmail.setName("Aman Chand");
   mail.setFrom(fromEmail);
   mail.setSubject("New registered users");
   
   Personalization personalization = new Personalization();
   Email to = new Email();
   to.setEmail("ansaria3250@gmail.com");        
   to.setName("Azhar");
   personalization.addTo(to);
   /*personalization.addHeader("X-Test", "test");
   personalization.addHeader("X-Mock", "true");
   personalization.addSubstitution("%name%", "Azhar");
   personalization.addSubstitution("%from%", "Aman Chand");*/
   mail.addPersonalization(personalization);
   mail.setTemplateId(EMAIL_TEMPLATE_ID);

  Email replyTo = new Email();
  replyTo.setName("Aman Chand");
  replyTo.setEmail("aman.chand@waviz.com");
  mail.setReplyTo(replyTo);

   return mail;
}



   
  public String sendEmailWithSendGrid() {
    SendGrid sg = new SendGrid(appKey);
    Request request = new Request();
    Mail mail = prepareMail();
   try
     {
     logger.info("Reached in try block") ;   
         logger.info("template id is- " +EMAIL_TEMPLATE_ID + " /n and api key is - " +appKey) ;   
     request.setMethod(Method.POST);
     request.setEndpoint("mail/send");
     request.setBody(mail.build());
     Response response = sg.api(request);
   if(response!=null){
     System.out.println("response code from sendgird" + response.getStatusCode());
     System.out.println(response.getBody());
     System.out.println(response.getHeaders());
        }
    }
   catch (IOException ex) {
   return "Failed to send mail! " + ex.getMessage();
        }
   return "email was successfully send";     
}

 
}

                  
      

            
    
      
    



        
