package com.github.corneil.reactivespring5.service;

import com.github.corneil.reactivespring5.model.ExtendedLocationHistory;
import com.github.corneil.reactivespring5.model.LocationHistory;
import reactor.core.publisher.Flux;

import java.util.Date;

public interface LocationHistoryInterface {
	Flux<LocationHistory> findByDates(Date startDate, Date endDate);
	Flux<ExtendedLocationHistory> findAndConvert(Date startDate, Date endDate);
}
