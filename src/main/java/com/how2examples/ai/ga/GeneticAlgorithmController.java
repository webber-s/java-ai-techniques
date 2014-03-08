package com.how2examples.ai.ga;

/**
 * Uses an iterative process to select the best solution.
 */
public class GeneticAlgorithmController {
   public static <T> T process(GenerationFactory<T> generationFactory, int maxNumberOfGenerations) {
      Generation<T> currentGeneration = generationFactory.createInitialGeneration();
      for (int i = 0; i < maxNumberOfGenerations; i++) {
         currentGeneration = generationFactory.generateNewGeneration(currentGeneration);
      }
      return currentGeneration.getFirst().getValue();
   }
}