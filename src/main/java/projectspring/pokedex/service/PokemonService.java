package projectspring.pokedex.service;import projectspring.pokedex.model.dto.PokemonDto;import java.util.List;public interface PokemonService {    List<PokemonDto> findAll();    PokemonDto findById(Long id);    PokemonDto save(PokemonDto pokemonDto);    PokemonDto update(Long id, PokemonDto pokemonDto);    PokemonDto delete(Long id);}