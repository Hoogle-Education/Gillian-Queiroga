package br.com.sigad.model.enums;

import br.com.sigad.model.interfaces.EnumWithText;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum Sigilo implements EnumWithText {

	OSTENSIVO ("Ostensivo"),
	SIGILOSO ("Sigiloso");

	private String absoluteText;
	private String parsedText;

	Sigilo(String text) {
		this.parsedText = text;
		this.absoluteText = text.replaceAll(" ", "_").toUpperCase();
	}
}
