package com.waviz.meeto.jobs;
import  org.springframework.beans.factory.annotation.Autowired;
import  com.waviz.meeto.jobs.service.EmailService;
import  org.springframework.web.bind.annotation.RestController;
import  org.slf4j.LoggerFactory;
import  org.slf4j.Logger;
import  org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class SampleJob {

Logger logger = LoggerFactory.getLogger(SampleJob.class);

    @Autowired
    private EmailService service;

    @RequestMapping("/api")
    public String send() {
    logger.info("calling service for send mail");
   return service.sendEmailWithSendGrid();
   }
}


/*
 @Override
    public void run(String... arg0) throws IOException, URISyntaxException {
        service.sendHTML("abc@gmail.com", "efg@gmail.com", "Hello World", "Hello, <strong>how are you doing?</strong>");
    }*/
