<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $arbitroid
 * @property string $nombre
 * @property string $carrera
 * @property string $fecha_ingreso
 * @property Arbitraje[] $arbitrajes
 */
class arbitros extends Model
{
    /**
     * The primary key for the model.
     * 
     * @var string
     */
    protected $primaryKey = 'arbitroid';

    /**
     * @var array
     */
    protected $fillable = ['nombre', 'carrera', 'fecha_ingreso'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function arbitrajes()
    {
        return $this->hasMany('App\Arbitraje', 'arbitroid', 'arbitroid');
    }
}
