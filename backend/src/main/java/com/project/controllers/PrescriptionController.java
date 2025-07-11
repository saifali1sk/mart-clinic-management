@PostMapping("/add/{token}")
public ResponseEntity<Prescription> createPrescription(
        @PathVariable String token,
        @Valid @RequestBody Prescription prescription
) {
    // Optional: validate token (simplified)
    if (!tokenService.isValid(token)) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    Prescription saved = prescriptionService.savePrescription(prescription);
    return ResponseEntity.status(HttpStatus.CREATED).body(saved);
}
