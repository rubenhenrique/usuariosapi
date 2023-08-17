package br.com.cotiinformatica.collections;

import java.time.Instant;
import java.util.UUID;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Document(collection = "mensagens_usuarios")
public class MensagensUsuarios {
	@Id
	private UUID id;
	private String tipo;
	private Instant dataHora;
	private String descricao;
	private String mensagem;
	private UUID usuarioId;
}
