package com.kairos.sajotuna.SajoTuna.calendar.CalendarEntity;


import com.kairos.sajotuna.SajoTuna.calendar.CalendarDTO.CalendarDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "calender2")
public class CalendarEntity {
    @Id
    @Column(name = "calender_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int calenderid;
    @Column(name = "date_start")
    private String dateStart;
    @Column(name="date_end",length = 30)
    private String dateEnd;
    @Column(name = "name",length = 20)
    private String name;
    @Column(name = "location",length = 255)
    private  String location;
    @Column(name = "memo",length = 255)
    private String memo;


    public static CalendarEntity toCalendarEntity(CalendarDTO calendarDTO){
        CalendarEntity calendarEntity = new CalendarEntity();
        calendarEntity.setCalenderid(calendarDTO.getCalenderId());
        calendarEntity.setDateStart(calendarDTO.getDateStart());
        calendarEntity.setDateEnd(calendarDTO.getDateEnd());
        calendarEntity.setLocation(calendarDTO.getLocation());
        calendarEntity.setName(calendarDTO.getName());
        calendarEntity.setMemo(calendarDTO.getMemo());
        return calendarEntity;
    }
}
