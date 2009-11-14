package grails.plugin.fixtures.exception

class UnsatisfiedBeanDefinitionRequirementException extends UnsatisfiedFixtureRequirementException {

    UnsatisfiedBeanDefinitionRequirementException(requirement, fixture, pattern) {
        super(
            "Fixture '$fixture.filename' requires the bean definition '$requirement' which was not satisfied (load pattern: $pattern)" as String,
            requirement,
            fixture,
            pattern
        )
    }
}