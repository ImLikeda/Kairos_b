package com.kairos.sajotuna.SajoTuna.calendar.CalendarDTO;


import com.kairos.sajotuna.SajoTuna.calendar.CalendarEntity.CalendarEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CalendarDTO {
    private int calenderId;
    private String dateStart;
    private String dateEnd;
    private String name;
    private String location;
    private String memo;

    public static CalendarDTO toCalendarDTO(CalendarEntity calendarEntity){
        CalendarDTO calendarDTO = new CalendarDTO();
        calendarDTO.setCalenderId(calendarEntity.getCalenderid());
        calendarDTO.setDateStart(calendarEntity.getDateStart());
        calendarDTO.setDateEnd(calendarEntity.getDateEnd());
        calendarDTO.setLocation(calendarEntity.getLocation());
        calendarDTO.setName(calendarEntity.getName());
        calendarDTO.setMemo(calendarEntity.getMemo());
        return calendarDTO;
    }
}
