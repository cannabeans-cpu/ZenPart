

interface ParticleInteraction {
    data class Vector2(val x: Float, val y: Float)

    // Determines if this interaction applies to the given pair of particles
    fun appliesTo(particle1: ElementParticle, particle2: ElementParticle): Boolean

    // Executes the interaction between the two particles
    fun interact(particle1: ElementParticle, particle2: ElementParticle, interactionPoint: Vector2)

}
