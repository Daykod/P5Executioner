// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package com.daykm.p5executioner.proto;

public interface DataOrBuilder extends
		// @@protoc_insertion_point(interface_extends:p5.Data)
		com.google.protobuf.MessageLiteOrBuilder {

	/**
	 * <code>repeated .p5.SpecialCombo specialCombos = 1;</code>
	 */
	java.util.List<com.daykm.p5executioner.proto.SpecialCombo>
	getSpecialCombosList();

	/**
	 * <code>repeated .p5.SpecialCombo specialCombos = 1;</code>
	 */
	com.daykm.p5executioner.proto.SpecialCombo getSpecialCombos(int index);

	/**
	 * <code>repeated .p5.SpecialCombo specialCombos = 1;</code>
	 */
	int getSpecialCombosCount();

	/**
	 * <code>repeated .p5.Skill skills = 2;</code>
	 */
	java.util.List<com.daykm.p5executioner.proto.Skill>
	getSkillsList();

	/**
	 * <code>repeated .p5.Skill skills = 2;</code>
	 */
	com.daykm.p5executioner.proto.Skill getSkills(int index);

	/**
	 * <code>repeated .p5.Skill skills = 2;</code>
	 */
	int getSkillsCount();

	/**
	 * <code>repeated .p5.ArcanaCombo arcanaCombos = 3;</code>
	 */
	java.util.List<com.daykm.p5executioner.proto.ArcanaCombo>
	getArcanaCombosList();

	/**
	 * <code>repeated .p5.ArcanaCombo arcanaCombos = 3;</code>
	 */
	com.daykm.p5executioner.proto.ArcanaCombo getArcanaCombos(int index);

	/**
	 * <code>repeated .p5.ArcanaCombo arcanaCombos = 3;</code>
	 */
	int getArcanaCombosCount();

	/**
	 * <code>repeated .p5.Persona personas = 4;</code>
	 */
	java.util.List<com.daykm.p5executioner.proto.Persona>
	getPersonasList();

	/**
	 * <code>repeated .p5.Persona personas = 4;</code>
	 */
	com.daykm.p5executioner.proto.Persona getPersonas(int index);

	/**
	 * <code>repeated .p5.Persona personas = 4;</code>
	 */
	int getPersonasCount();

	/**
	 * <code>repeated .p5.RareComboModifier rareModifiers = 5;</code>
	 */
	java.util.List<com.daykm.p5executioner.proto.RareComboModifier>
	getRareModifiersList();

	/**
	 * <code>repeated .p5.RareComboModifier rareModifiers = 5;</code>
	 */
	com.daykm.p5executioner.proto.RareComboModifier getRareModifiers(int index);

	/**
	 * <code>repeated .p5.RareComboModifier rareModifiers = 5;</code>
	 */
	int getRareModifiersCount();

	/**
	 * <code>repeated .p5.DLCPersona dlcPersonae = 6;</code>
	 */
	java.util.List<com.daykm.p5executioner.proto.DLCPersona>
	getDlcPersonaeList();

	/**
	 * <code>repeated .p5.DLCPersona dlcPersonae = 6;</code>
	 */
	com.daykm.p5executioner.proto.DLCPersona getDlcPersonae(int index);

	/**
	 * <code>repeated .p5.DLCPersona dlcPersonae = 6;</code>
	 */
  int getDlcPersonaeCount();
}