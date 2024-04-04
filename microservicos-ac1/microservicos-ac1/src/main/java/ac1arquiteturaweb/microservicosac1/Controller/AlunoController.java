package ac1arquiteturaweb.microservicosac1.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ac1arquiteturaweb.microservicosac1.Modelo.Aluno;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();
    private Long nextId = 1L;

    // Construtor para adicionar exemplos pré-fixados de alunos
    public AlunoController() {
        alunos.add(new Aluno(nextId++, "João", 20, "Engenharia", "joao@example.com"));
        alunos.add(new Aluno(nextId++, "Maria", 22, "Administração", "maria@example.com"));
    }

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunos;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAlunoById(@PathVariable Long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return new ResponseEntity<>(aluno, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno) {
        aluno.setId(nextId++);
        alunos.add(aluno);
        return new ResponseEntity<>(aluno, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno currentAluno = alunos.get(i);
            if (currentAluno.getId().equals(id)) {
                aluno.setId(id);
                alunos.set(i, aluno);
                return new ResponseEntity<>(aluno, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAluno(@PathVariable Long id) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            if (aluno.getId().equals(id)) {
                alunos.remove(i);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}


