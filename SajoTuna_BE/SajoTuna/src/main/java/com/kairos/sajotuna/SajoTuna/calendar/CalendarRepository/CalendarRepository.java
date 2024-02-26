package com.kairos.sajotuna.SajoTuna.calendar.CalendarRepository;

import com.kairos.sajotuna.SajoTuna.calendar.CalendarEntity.CalendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendarRepository extends JpaRepository<CalendarEntity,Long> {
    public CalendarEntity findByCalenderid(int calendarId);
}
