package za.co.assessment.swift.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import za.co.assessment.swift.domain.BusinessRulesResponseDto;
import za.co.assessment.swift.domain.MT101;

@Component
public class RoutingRulesHelper {
	
	private BusinessRulesResponseDto businessRulesResponseDto;
	
	@Bean
	public BusinessRulesResponseDto getDestinationFromBusinessRules(MT101 mt101) {
		RestTemplate restTemplate = new RestTemplate();
		businessRulesResponseDto = restTemplate.getForObject("https://some/rest/path/"+mt101, BusinessRulesResponseDto.class);
		return businessRulesResponseDto;
	}
}
