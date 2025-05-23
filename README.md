# 📦 QR Code Generator API

Uma API simples construída com **Java + Spring ** para gerar QR Codes a partir de textos. Ao receber um texto via requisição, a API gera um QR Code e retorna uma **URL pública** da imagem armazenada na **AWS S3**.

> 🔗 Projeto inspirado no vídeo da [Fernanda Kipper | Dev](https://www.youtube.com/watch?v=71WGVa79BWE&ab_channel=FernandaKipper%7CDev)

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- AWS SDK (S3)
- Docker
- QR Code Generator ZXing

---

## 📌 Funcionalidade Principal

- [x] Receber um texto via parâmetro
- [x] Gerar um QR Code a partir do texto
- [x] Salvar a imagem em um bucket S3 da AWS
- [x] Retornar a URL pública da imagem gerada
---

## 🐳 Docker

### 📦 Build da imagem

```bash
  docker build -t qrcode-generate:1.0 .
```

### 🚀 Execução do container

```bash
  docker run --env-file .env -p 8080:8080 qrcode-generate:1.0
```
---

## 📖 Swagger - Documentação da API

Esta aplicação utiliza o **Swagger** para documentar e testar os endpoints da API.

### 🔍 Acessando a interface do Swagger

Após subir a aplicação (localmente ou via Docker), acesse no navegador:
[Abrir documentação](http://localhost:8080/swagger-ui.html)



