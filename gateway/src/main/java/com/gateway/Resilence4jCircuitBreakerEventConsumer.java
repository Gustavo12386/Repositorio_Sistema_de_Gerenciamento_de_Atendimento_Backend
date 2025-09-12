package com.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.core.registry.EntryAddedEvent;
import io.github.resilience4j.core.registry.EntryRemovedEvent;
import io.github.resilience4j.core.registry.EntryReplacedEvent;
import io.github.resilience4j.core.registry.RegistryEventConsumer;

@Component
public class Resilence4jCircuitBreakerEventConsumer implements RegistryEventConsumer<CircuitBreaker> {

	 private static final Logger log = LoggerFactory.getLogger(Resilence4jCircuitBreakerEventConsumer.class);

	 @Override
	 public void onEntryAddedEvent(EntryAddedEvent<CircuitBreaker> entryAddedEvent) {
		 entryAddedEvent.getAddedEntry().getEventPublisher()
         .onEvent(event -> log.info(event.toString()));		
	 }

	 @Override
	 public void onEntryRemovedEvent(EntryRemovedEvent<CircuitBreaker> entryRemoveEvent) {
		// TODO Auto-generated method stub
		
	 }

	 @Override
	 public void onEntryReplacedEvent(EntryReplacedEvent<CircuitBreaker> entryReplacedEvent) {
		// TODO Auto-generated method stub
		
	 }
	 
	 
}
