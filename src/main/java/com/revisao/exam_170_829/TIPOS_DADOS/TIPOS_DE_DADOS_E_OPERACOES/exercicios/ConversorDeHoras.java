package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.exercicios;

import java.time.Duration;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ConversorDeHoras {
    public static void main(String[] args) {
        ZonedDateTime dateHourNow = ZonedDateTime.now();
        Period period = Period.ofDays(2);
        Duration duration = Duration.ofHours(1);

        System.out.println("Data e hora atual: " + dateHourNow);
        System.out.println("Data e hora atual + 1 dia: " + dateHourNow.plus(period));
        System.out.println("Data e hora atual + 1 hora: " + dateHourNow.plus(duration));

        System.out.println("Diferença entre data e hora atual e data e hora atual + 1 dia: "
                + dateHourNow.until(dateHourNow.plus(period), ChronoUnit.DAYS));

        System.out.println("Diferença entre data e hora atual e data e hora atual + 1 hora: "
                + dateHourNow.until(dateHourNow.plus(period), ChronoUnit.HOURS));

        System.out.println("Diferença entre data e hora atual e data e hora atual + 1 dia: "
                + dateHourNow.until(dateHourNow.plus(period), ChronoUnit.MINUTES));

        System.out.println("--------------------------------------------");

        System.out.println("Data e hora atual [UTC Asia/Singapura]: " + dateHourNow.withZoneSameInstant(java.time.ZoneId.of("Asia/Singapore")));
        System.out.println("Data e hora atual + 1 dia [UTC Asia/Singapura]: " + dateHourNow.withZoneSameInstant(java.time.ZoneId.of("Asia/Singapore")).plus(period));
        System.out.println("Data e hora atual + 1 hora [UTC Asia/Singapura]: " + dateHourNow.withZoneSameInstant(java.time.ZoneId.of("Asia/Singapore")).plus(duration));

        System.out.println("--------------------------------------------");

        System.out.println("Data e hora atual [UTC Europe/London]: " + dateHourNow.withZoneSameInstant(java.time.ZoneId.of("Europe/London")));
        System.out.println("Data e hora atual + 1 dia [UTC Europe/London]: " + dateHourNow.withZoneSameInstant(java.time.ZoneId.of("Europe/London")).plus(period));
        System.out.println("Data e hora atual + 1 hora [UTC Europe/London]: " + dateHourNow.withZoneSameInstant(java.time.ZoneId.of("Europe/London")).plus(duration));
    }
}
