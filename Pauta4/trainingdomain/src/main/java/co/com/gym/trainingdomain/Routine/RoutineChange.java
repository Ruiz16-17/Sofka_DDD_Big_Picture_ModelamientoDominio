package co.com.gym.trainingdomain.Routine;

import co.com.gym.trainingdomain.Routine.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class RoutineChange extends EventChange {

    public RoutineChange(Routine routine){

        apply((CreatedRoutine event) -> {
            routine.name = event.getName();
            routine.description = event.getDescription();
            routine.sectionSet = new HashSet<>();
        });

        apply((UpdatedName event) -> {
            routine.name = event.getName();
        });

        apply((UpdatedDescription event) -> {
            routine.description = event.getDescription();
        });

        apply((AddedSection event) -> {
            routine.sectionSet.add(new Section(
                    event.getSectionId(),
                    event.getDaySection(),
                    event.getNameMuscleGroupSection(),
                    event.getExcerciseSet()
            ));
        });

        apply((UpdatedMuscleGroupSection event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));
            section.updatedMuscleGroup(event.getNameMuscleGroupSection());
        });

        apply((UpdatedDaySection event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));

            section.updateDay(event.getDaySection());
        });

        apply((AddedExcercise event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));
            section.addExcerciseSection(new Excercise(event.getExcerciseId(), event.getRepetitionsExcercise(),event.getSeriesExcercise()
                    , event.getDescription(),event.getWeighExcercise(), event.getBreakExcercise(), event.getName()));
        });

        apply((UpdatedRepetitionExcercise event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));
            var excercise = section.getExcercisetById(event.getExcerciseId())
                    .orElseThrow(() -> new IllegalArgumentException("Excercise not found"));
            excercise.updateRepetitions(event.getRepetitionsExcercise());
        });

        apply((UpdatedSeriesExcercise event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));
            var excercise = section.getExcercisetById(event.getExcerciseId())
                    .orElseThrow(() -> new IllegalArgumentException("Excercise not found"));
            excercise.updateSeries(event.getSeriesExcercise());
        });

        apply((UpdatedDescriptionExcercise event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));
            var excercise = section.getExcercisetById(event.getExcerciseId())
                    .orElseThrow(() -> new IllegalArgumentException("Excercise not found"));
            excercise.updateDescription(event.getDescription());
        });

        apply((UpdatedWeighExcercise event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));
            var excercise = section.getExcercisetById(event.getExcerciseId())
                    .orElseThrow(() -> new IllegalArgumentException("Excercise not found"));
            excercise.updateWeighs(event.getWeighExcercise());
        });

        apply((UpdatedBreakExcercise event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));
            var excercise = section.getExcercisetById(event.getExcerciseId())
                    .orElseThrow(() -> new IllegalArgumentException("Excercise not found"));
            excercise.updateBreak(event.getBreakExcercise());
        });

        apply((UpdatedNameExcercise event) -> {
            var section = routine.getSectionById(event.getSectionId())
                    .orElseThrow(() -> new IllegalArgumentException("Section not found"));
            var excercise = section.getExcercisetById(event.getExcerciseId())
                    .orElseThrow(() -> new IllegalArgumentException("Excercise not found"));
            excercise.updateName(event.getName());
        });

    }
}
