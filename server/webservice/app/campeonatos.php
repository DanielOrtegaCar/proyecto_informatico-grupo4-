<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $campeonatoid
 * @property int $divisionid
 * @property int $campeon
 * @property int $ano
 * @property string $nombre
 * @property string $semestre
 * @property string $fecha_inicio
 * @property string $fecha_termino
 * @property string $reglamento
 * @property Equipo $equipo
 * @property Divisione $divisione
 */
class campeonatos extends Model
{
    /**
     * The primary key for the model.
     * 
     * @var string
     */
    protected $primaryKey = 'campeonatoid';

    /**
     * @var array
     */
    protected $fillable = ['divisionid', 'campeon', 'ano', 'nombre', 'semestre', 'fecha_inicio', 'fecha_termino', 'reglamento'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function equipo()
    {
        return $this->belongsTo('App\Equipo', 'campeon', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function divisione()
    {
        return $this->belongsTo('App\Divisione', 'divisionid', 'divisionid');
    }
}
