

class ElementInteractionManager {

    private val interactions: List<ParticleInteraction> = listOf(
        SandSandInteraction()
        // Add other interactions as you define them
    )

    fun handleInteraction(particle1: ElementParticle, particle2: ElementParticle, interactionPoint: ParticleInteraction.Vector2) {
        for (interaction in interactions) {
            if (interaction.appliesTo(particle1, particle2)) {
                interaction.interact(particle1, particle2, interactionPoint)
                break
            }
        }
    }
}