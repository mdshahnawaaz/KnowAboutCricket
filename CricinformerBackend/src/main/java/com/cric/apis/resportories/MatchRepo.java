package com.cric.apis.resportories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cric.apis.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer>{

	//match fetch karna chahte hai
	//provide kar de --> team heading 
	Optional<Match>findByTeamHeading(String teamHeading);
}
