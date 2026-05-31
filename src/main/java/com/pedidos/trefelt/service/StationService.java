package com.pedidos.trefelt.service;

import com.pedidos.trefelt.dto.StationDto;
import com.pedidos.trefelt.entity.Gap;
import com.pedidos.trefelt.entity.Station;
import com.pedidos.trefelt.repository.GapRepository;
import com.pedidos.trefelt.repository.StationRepository;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    public StationService(StationRepository stationRepo, GapRepository gapRepo){
        this.stationRepo = stationRepo;
        this.gapRepo = gapRepo;
    }

    private StationRepository stationRepo;
    private GapRepository gapRepo;

    public Station save(StationDto request){

        Station station = new Station();
        Gap gap = gapRepo.findById(request.getGapId()).orElseThrow();

        station.setGap(gap);
        station.setName(request.getName());

        return stationRepo.save(station);
    }

    public Station findById(Integer id){
        return stationRepo.findById(id).orElseThrow();
    }

}
