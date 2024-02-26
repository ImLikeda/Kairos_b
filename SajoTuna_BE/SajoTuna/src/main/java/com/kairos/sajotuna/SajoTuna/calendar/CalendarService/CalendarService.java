package com.kairos.sajotuna.SajoTuna.calendar.CalendarService;


import com.kairos.sajotuna.SajoTuna.calendar.CalendarDTO.CalendarDTO;
import com.kairos.sajotuna.SajoTuna.calendar.CalendarEntity.CalendarEntity;
import com.kairos.sajotuna.SajoTuna.calendar.CalendarRepository.CalendarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CalendarService {
    private final CalendarRepository calendarRepository;
    public void save(CalendarDTO calendarDTO){
        CalendarEntity calendarEntity = CalendarEntity.toCalendarEntity(calendarDTO);
        calendarRepository.save(calendarEntity);
    }
    public CalendarEntity FindByCalendarId(int calendarId){
        return calendarRepository.findByCalenderid(calendarId);
    }
}
