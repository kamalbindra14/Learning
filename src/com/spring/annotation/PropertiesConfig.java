package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author kamal.bindra
 *
 */
@Configuration
public class PropertiesConfig {
  @Value("${juggler.items}")
  private String items;

  public String getItems() {
    return items;
  }
}
