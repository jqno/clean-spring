package com.jumbo.demo;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.jumbo.demo")
class ArchitectureTest {

    @ArchTest
    public static final ArchRule MODELS_ARE_USED_BY_CONTROLLERS = classes()
        .that()
        .resideInAPackage("..model..")
        .should()
        .onlyBeAccessed()
        .byAnyPackage("..controller..", "..model..");
}
