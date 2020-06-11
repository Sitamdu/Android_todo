package com.example.todomvvm.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
// TODO (01) Create annotated interface TaskDao.
public interface TaskDao {

    @Query("select * from task order by priority")
    List<TaskEntry> loadAllTasks();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTask(TaskEntry task);

    @Update
    void update(TaskEntry task);

    @Delete
    void deleteTask(TaskEntry task);

    @Query("Select * from task where id = :id")
    TaskEntry loaddTaskById(int id);



}
