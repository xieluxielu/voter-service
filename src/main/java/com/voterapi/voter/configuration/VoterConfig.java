package com.voterapi.voter.configuration;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoterConfig {

    /**
     * Used for RPC IPC example
     *
     * @return
     */
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("voter.rpc");
    }


    /**
     * Used for eventually consistent example
     *
     * @return
     */
    @Bean
    public Queue candidateQueue() {
        return new Queue("candidates.queue");
    }

//    @Bean
//    public FanoutExchange candidateFanoutExchange() {
//        return new FanoutExchange("candidate.fanout");
//    }

//    @Bean
//    public Queue candidateQueue() {
//        return new AnonymousQueue();
//    }

//    @Bean
//    public Binding candidateBinding(FanoutExchange candidateFanoutExchange,
//                            Queue candidateQueue) {
//        return BindingBuilder.bind(candidateQueue).to(candidateFanoutExchange);
//    }
}
