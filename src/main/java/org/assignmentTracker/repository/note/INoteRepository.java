package org.assignmentTracker.repository.note;

/**
 * @author : Lyse-Celeste Irakoze
 * Student Number : 217132057
 * Date : 30 August 2020
 * INoteRepository interface
 */

import org.assignmentTracker.entity.Note;
import org.assignmentTracker.repository.IRepository;

import java.util.Set;

public interface INoteRepository extends IRepository<Note, Integer> {

    Set<Note> getAll();

}